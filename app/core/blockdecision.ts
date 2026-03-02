import { getUsage } from "./usagetracker"
import { isLimitExceeded, TimeRule } from "./timerules"

export function shouldBlock(rule: TimeRule): boolean {
  return isLimitExceeded(getUsage(rule.appId), rule)
}