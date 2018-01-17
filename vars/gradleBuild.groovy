#!/usr/bin/env groovy

def call(String name = 'java') {
  echo "Starting ${name} build..."
  sh "gradle --version"
}