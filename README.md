# Marigold

Marigold is a plugin for Atlassian Bitbucket to enhance the pull request experience.

This plugin allows you 
to customize the pull request with custom comments and tasks defined via `marigold.yaml` configuration.

Comments and tasks will be added to pull requests based on configuration and updated through lifecycle as pull request
may add/remove files from the scope.

## Configuration
Marigold has no global configuration and setup is done on the repository level.

Bitbucket administrators should perform these tasks in order to enable Jaskier:

- Enable Jaskier in repository settings
- Store jaskier.yaml in root folder

This is what marigold.yaml should look like:
```yaml
version: 1.0
definitions:
  LOREM: |
    Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Etiam bibendum elit eget erat.

    Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae.
  SHORT: This is short comment
  TASK-DOCS: Make sure docs is up to date
mapping:
  tasks:
    # No leading slash
    'src/main/java/sk.mstyk/**':
      - TASK-DOCS
  comments:
    # All files affected in pull request
    '**':
      - LOREM
```

## Development
Plugin leverages [Atlassian Plugin SDK](https://developer.atlassian.com/server/framework/atlassian-sdk/set-up-the-atlassian-plugin-sdk-and-build-a-project/).

Run the application in debug mode with your plugin installed
```shell
atlas-debug
```

To test any further changes to the plugin, you just need to simply run
```shell
atlas-mvn package
```

## Authors
Martin Styk <mart.styk@gmail.com>

## License
Apache-2.0