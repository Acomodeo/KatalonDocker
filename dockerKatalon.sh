#!/bin/bash

docker run -t --rm -v "$(pwd)":/katalon/katalon/source   -v $(pwd)/reports/chrome:/katalon/katalon/report katalonstudio/katalon:6.3.3 katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TestEveryIBE" -apiKey=3cc4c4ee-18da-4a5e-9c31-8e00312eb18d
sleep 33
docker run -t --rm -v "$(pwd)":/katalon/katalon/source   -v $(pwd)/reports/firefox:/katalon/katalon/report katalonstudio/katalon:6.3.3 katalon-execute.sh -browserType="Firefox" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TestEveryIBE" -apiKey=3cc4c4ee-18da-4a5e-9c31-8e00312eb18d

