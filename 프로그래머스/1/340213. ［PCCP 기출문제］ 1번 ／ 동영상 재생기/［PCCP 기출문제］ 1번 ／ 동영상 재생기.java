import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		int videoSec = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3));
		int opStartSec = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3));
		int opEndSec = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3));

		int nowSec = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3));
		if (nowSec < opEndSec && nowSec >= opStartSec) {
			nowSec = opEndSec;
		}

		Map<String, Integer> commandSec = new HashMap<>();
		commandSec.put("next", 10);
		commandSec.put("prev", -10);

		for (String command : commands) {
			nowSec += commandSec.get(command);

			if (nowSec < 0) {
				nowSec = 0;
			} else if (nowSec > videoSec) {
				nowSec = videoSec;
			}
			if (nowSec < opEndSec && nowSec >= opStartSec) {
				nowSec = opEndSec;
			}
		}

		StringBuilder sb = new StringBuilder();
		int min = nowSec / 60;
		if (min < 10) {
			sb.append("0");
		}
		sb.append(min).append(":");
		int sec = nowSec % 60;
		if (sec < 10) {
			sb.append("0");
		}
		sb.append(sec);

		return sb.toString();
	}
}