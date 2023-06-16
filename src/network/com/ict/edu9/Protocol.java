
package network.com.ict.edu9;

import java.io.Serializable;

public class Protocol implements Serializable{
	// 1: 전체보기, 2: 삽입, 3: 삭제, 4: 검색
	int cmd;

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	

}