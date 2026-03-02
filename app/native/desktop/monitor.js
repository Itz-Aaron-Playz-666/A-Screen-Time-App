import { exec } from "child_process"

export function getRunningApps(callback) {
  exec("ps -A -o comm", (err, stdout) => {
    callback(stdout.split("\n"))
  })
}