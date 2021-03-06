# gradle-svntools-plugin

A [Gradle](https://www.gradle.org) plugin (based on [SVNKit](http://svnkit.com/)) that provides various [Subversion](http://svnbook.red-bean.com/)-related tasks.

The svntools-plugin can interact with existing SVN workspaces as well as create new workspaces (by performing a svn-checkout). It can interact with any SVN working copy format; no additional SVN client is required.

Please report bugs and feature requests at the [Github issue page](https://github.com/martoe/gradle-svntools-plugin/issues).

## Version compatibility

Plugin version | Gradle version | Java version 
-------------- | -------------- | -------------
[up to 1.7](../gradle2/README.md) | 2.0 - 2.14     | 1.6 and above
2.0 and above  | 3.0 and above  | 1.7 and above

## Usage

* [Applying the plugin](docs/ApplyPlugin.md)
* [General Configuration](docs/GeneralConfig.md)
* [Examples](examples/)

## Available tasks

* [SvnInfo](docs/SvnInfo.md): information about a workspace file
* [SvnVersion](docs/SvnVersion.md): summarize the local revision(s) of a working copy.
* [SvnCheckout](docs/SvnCheckout.md): creates a local workspace of an SVN repository
* [SvnUpdate](docs/SvnUpdate.md): updates an SVN workspace
* [SvnAdd](docs/SvnAdd.md): schedules svn add of files in the SVN workspace
* [SvnDelete](docs/SvnDelete.md): schedules svn delete of files in the SVN workspace
* [SvnCommit](docs/SvnCommit.md): commits workspace modifications
* [SvnRevert](docs/SvnRevert.md): reverts workspace modifications
* [SvnCreatePatch](docs/SvnCreatePatch.md): creates a patch file based on workspace modifications
* [SvnApplyPatch](docs/SvnApplyPatch.md): applies a patch file
* [SvnBranch](docs/SvnBranch.md): creates an SVN branch
* [SvnTag](docs/SvnTag.md): creates an SVN tag
* [SvnExport](docs/SvnExport.md): exports parts of an SVN repository to a local directory

[![Build Status](https://api.travis-ci.org/martoe/gradle-svntools-plugin.svg?branch=develop)](https://travis-ci.org/martoe/gradle-svntools-plugin)
[![Coverage Status](https://coveralls.io/repos/github/martoe/gradle-svntools-plugin/badge.svg?branch=develop)](https://coveralls.io/github/martoe/gradle-svntools-plugin?branch=develop)
