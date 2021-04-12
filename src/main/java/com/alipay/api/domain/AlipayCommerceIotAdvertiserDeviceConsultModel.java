package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备生效信息
 *
 * @author auto create
 * @since 1.0, 2020-05-06 13:28:43
 */
public class AlipayCommerceIotAdvertiserDeviceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1782738677225291985L;

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
