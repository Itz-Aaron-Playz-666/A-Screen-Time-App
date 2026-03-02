export interface TimeRule {
  appId: string
  dailyLimitMinutes: number
}

export function isLimitExceeded(
  usedMinutes: number,
  rule: TimeRule
): boolean {
  return usedMinutes >= rule.dailyLimitMinutes
}