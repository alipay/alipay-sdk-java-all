package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayMarketingVoucherStockMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8299953399155463563L;

	/** 
	 * 已存在券码列表, 已通过创建接口上传的列表
	 */
	@ApiListField("exist_list")
	@ApiField("string")
	private List<String> existList;

	/** 
	 * 不存券码列表，还未上传过的券码
	 */
	@ApiListField("not_exist_list")
	@ApiField("string")
	private List<String> notExistList;

	public void setExistList(List<String> existList) {
		this.existList = existList;
	}
	public List<String> getExistList( ) {
		return this.existList;
	}

	public void setNotExistList(List<String> notExistList) {
		this.notExistList = notExistList;
	}
	public List<String> getNotExistList( ) {
		return this.notExistList;
	}

}
