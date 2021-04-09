package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherRec;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.shoppingmallrec.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceShoppingmallrecVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5899972943861976117L;

	/** 
	 * 本次推荐的id, 开发者埋点需带入此参数
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/** 
	 * 本次请求的全局唯一标识, 支持英文字母和数字, 由开发者自行定义,和入参request_id一致
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 商场券的推荐列表
	 */
	@ApiListField("voucher_recommend_list")
	@ApiField("voucher_rec")
	private List<VoucherRec> voucherRecommendList;

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setVoucherRecommendList(List<VoucherRec> voucherRecommendList) {
		this.voucherRecommendList = voucherRecommendList;
	}
	public List<VoucherRec> getVoucherRecommendList( ) {
		return this.voucherRecommendList;
	}

}
