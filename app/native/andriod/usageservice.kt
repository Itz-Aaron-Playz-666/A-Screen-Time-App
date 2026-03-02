class UsageService : Service() {

    private val usageStatsManager by lazy {
        getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
    }

    fun getForegroundApp(): String? {
        val end = System.currentTimeMillis()
        val start = end - 1000 * 10

        val stats = usageStatsManager.queryUsageStats(
            UsageStatsManager.INTERVAL_DAILY,
            start,
            end
        )

        return stats.maxByOrNull { it.lastTimeUsed }?.packageName
    }
}