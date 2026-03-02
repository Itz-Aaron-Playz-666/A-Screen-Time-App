import { NativeModules } from "react-native"

export const { Blocker } = NativeModules

export function blockApp(appId: string) {
  Blocker.block(appId)
}