class MonitorExtension: DeviceActivityMonitor {

    override func eventDidReachThreshold(
        _ event: DeviceActivityEvent.Name,
        activity: DeviceActivityName
    ) {
        // iOS automatically blocks the app
    }
}