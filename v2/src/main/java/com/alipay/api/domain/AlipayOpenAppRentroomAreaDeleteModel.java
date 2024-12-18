package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房小区信息删除
 *
 * @author auto create
 * @since 1.0, 2024-09-13 19:28:16
 */
public class AlipayOpenAppRentroomAreaDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6858475845458215961L;

	/**
	 * 支付宝平台生成的小区ID列表
	 */
	@ApiListField("area_id_list")
	@ApiField("string")
	private List<String> areaIdList;

	/**
	 * 商户侧定义的小区编码列表
	 */
	@ApiListField("out_area_id_list")
	@ApiField("string")
	private List<String> outAreaIdList;

	public List<String> getAreaIdList() {
		return this.areaIdList;
	}
	public void setAreaIdList(List<String> areaIdList) {
		this.areaIdList = areaIdList;
	}

	public List<String> getOutAreaIdList() {
		return this.outAreaIdList;
	}
	public void setOutAreaIdList(List<String> outAreaIdList) {
		this.outAreaIdList = outAreaIdList;
	}

}
