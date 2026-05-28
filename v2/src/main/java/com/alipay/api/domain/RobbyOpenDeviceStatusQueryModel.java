package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机器人状态查询
 *
 * @author auto create
 * @since 1.0, 2026-02-26 16:37:42
 */
public class RobbyOpenDeviceStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7768735737745913363L;

	/**
	 * null
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

}
