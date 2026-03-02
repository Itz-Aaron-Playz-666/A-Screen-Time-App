class BlockOverlayService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val overlay = LayoutInflater.from(this)
            .inflate(R.layout.block_screen, null)

        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        )

        getSystemService(WindowManager::class.java)
            .addView(overlay, params)

        return START_STICKY
    }
}