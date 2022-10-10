package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sn.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-28 19:40:16
 */
public class AlipayCommerceIotSnCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3421283559411581499L;

	/** 
	 * 申请单id，用于后续追踪或查询该批次的设备sn
	 */
	@ApiField("apply_id")
	private Long applyId;

	/** 
	 * 生成的sn列表
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}
	public Long getApplyId( ) {
		return this.applyId;
	}

	public void setSnList(List<String> snList) {
		this.snList = snList;
	}
	public List<String> getSnList( ) {
		return this.snList;
	}

}
