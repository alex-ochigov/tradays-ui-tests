### Requirements
1. Node.js
2. Java 8
3. Android SDK

### Install dependencies
1. `npm i`

### Check appium requirements
`npm run doctor`

### Prepare devices
You'll need 2 emulators with ids `emulator-5444` and `emaulator-5446`, with android version 9

### How to run
1. `npm run start` - start grid
1. `./gradlew clean test` - run tests
2. `./gradlew allureReport` - generate reports
3. `./gradlew allureServe` - serve reports
