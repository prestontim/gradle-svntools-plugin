package at.bxm.gradleplugins.svntools.tasks

import org.gradle.api.tasks.TaskExecutionException

class SvnRevertTest extends SvnWorkspaceTestSupport {

  def "reverting a single file"() {
    given:
    def file = existingFile("test.txt")
    file.text = "changed"

    when: "running the SvnRevert task"
    def task = taskWithType(SvnRevert)
    task.revert file
    task.execute()

    then: "file reverted"
    file.text == ""
  }

  def "reverting a directory non-recursively"() {
    given:
    def file = existingFile("test.txt")
    file.text = "changed"

    when: "running the SvnRevert task on the base directory only"
    def task = taskWithType(SvnRevert)
    task.revert = workspace
    task.execute()

    then: "file not reverted"
    file.text == "changed"
  }
  
  def "reverting a directory recursively"() {
    given:
    def file = existingFile("test.txt")
    file.text = "changed"

    when: "running the SvnRevert task on the base directory recursively"
    def task = taskWithType(SvnRevert)
    task.revert << workspace
    task.recursive = true
    task.execute()

    then: "file reverted"
    file.text == ""
  }

  def "reverting without a workspace"() {
    when: "running the SvnRevert task outside a working copy"
    def task = taskWithType(SvnRevert)
    task.revert = tempDir
    task.execute()

    then: "exception"
    def exception = thrown TaskExecutionException
    exception.cause.message.readLines().size() == 2
    exception.cause.message.readLines()[1] =~ "svn: E155007: .* is not a working copy"
  }
}
