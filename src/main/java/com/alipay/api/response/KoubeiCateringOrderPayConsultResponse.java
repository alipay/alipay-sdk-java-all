package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountDetail;
import com.alipay.api.domain.MCardDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringOrderPayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2794893999681279277L;

	/** 
	 * 优惠信息
	 */
	@ApiListField("discount_details")
	@ApiField("discount_detail")
	private List<DiscountDetail> discountDetails;

	/** 
	 * 储值卡信息
	 */
	@ApiField("m_card_detail")
	private MCardDetail mCardDetail;

	/** 
	 * 用户实付金额，以元为单位，精确到分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 请求中的request_id。拿到结果后最好做下请求ID和返回的结果请求ID是否一致，防止万一请求串掉。
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 订单付款金额，以元为单位，精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setDiscountDetails(List<DiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}
	public List<DiscountDetail> getDiscountDetails( ) {
		return this.discountDetails;
	}

	public void setmCardDetail(MCardDetail mCardDetail) {
		this.mCardDetail = mCardDetail;
	}
	public MCardDetail getmCardDetail( ) {
		return this.mCardDetail;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
