#!/bin/bash

docker run -t --rm -v "$(pwd)":/katalon/katalon/source   -v $(pwd)/reports/chrome:/katalon/katalon/report katalonstudio/katalon katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TestEveryIBE" -apiKey=e08517c1-f1c7-4292-9494-ae4931cedcdd
sleep 30
docker run -t --rm -v "$(pwd)":/katalon/katalon/source   -v $(pwd)/reports/firefox:/katalon/katalon/report katalonstudio/katalon katalon-execute.sh -browserType="Firefox" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TestEveryIBE" -apiKey=e08517c1-f1c7-4292-9494-ae4931cedcdd
