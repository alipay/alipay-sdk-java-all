package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备生效信息
 *
 * @author auto create
 * @since 1.0, 2021-06-16 16:39:04
 */
public class AlipayCommerceIotAdvertiserDeviceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7558938936847983126L;

	/**
	 * sn列表，最多100个
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
