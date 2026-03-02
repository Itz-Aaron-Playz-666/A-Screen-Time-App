import FamilyControls
import DeviceActivity

class ScreenTimeManager {

    func requestPermission() async throws {
        try await AuthorizationCenter.shared.requestAuthorization(for: .individual)
    }

    func blockApps(_ apps: Set<ApplicationToken>) {
        let schedule = DeviceActivitySchedule(
            intervalStart: .hourAndMinute(0, 0),
            intervalEnd: .hourAndMinute(23, 59)
        )

        let event = DeviceActivityEvent(
            applications: apps,
            threshold: DateComponents(minute: 60)
        )

        try? DeviceActivityCenter.shared.startMonitoring(
            .daily,
            during: schedule,
            events: [.limitReached: event]
        )
    }
}