//package inheritance;
//
//public class Quiz02 {
//
//	public static void main(String[] args) {
//
//		BasicTV basicTV = new BasicTV("on", 7, 20);
//		SmartTV smartTV = new SmartTV("on", 11, 30, "192.168.0.111");
//
//		System.out.println("전원상태:" + basicTV.power + ", " + "채널:" + basicTV.channel + ", " + "볼륨:" + basicTV.volume);
//		System.out.println("전원상태:" + smartTV.power + ", " + "채널:" + smartTV.channel + ", " + "볼륨:" + smartTV.volume
//				+ ", " + "아이피:" + smartTV.ip);
//
//	}
//
//}
//
//class BasicTV {
//	String power;
//	int channel;
//	int volume;
//
//	public BasicTV(String power, int channel, int volume) {
//		super();
//		this.power = power;
//		this.channel = channel;
//		this.volume = volume;
//	}
//
//}
//
//class SmartTV extends BasicTV {
//	String ip;
//
//	public SmartTV(String power, int channel, int volume, String ip) {
//		super(power, channel, volume);
//		this.ip = ip;
//	}
//}
