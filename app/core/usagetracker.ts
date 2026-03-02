const usageMap: Record<string, number> = {}

export function addUsage(appId: string, minutes: number) {
  usageMap[appId] = (usageMap[appId] || 0) + minutes
}

export function getUsage(appId: string): number {
  return usageMap[appId] || 0
}