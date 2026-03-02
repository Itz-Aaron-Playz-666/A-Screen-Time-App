import { exec } from "child_process"

export function killApp(processName) {
  exec(`pkill ${processName}`)
}