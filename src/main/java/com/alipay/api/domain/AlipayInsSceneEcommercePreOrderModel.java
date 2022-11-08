package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险电商场景保单预下单
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:22:16
 */
public class AlipayInsSceneEcommercePreOrderModel extends AlipayObject {

	private static final long serialVersionUID = 6874927414847762384L;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 是否需要核验保障方案定价
	 */
	@ApiField("check_quote")
	private Boolean checkQuote;

	/**
	 * 用户选定的保障方案
	 */
	@ApiField("insure_plan_dto")
	private InsurePlanDTO insurePlanDto;

	/**
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 订单信息
	 */
	@ApiField("order_dto")
	private EcomOrderDTO orderDto;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 推荐流水id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	/**
	 * 回溯记录
	 */
	@ApiListField("trace_list")
	@ApiField("ins_user_trace_d_t_o")
	private List<InsUserTraceDTO> traceList;

	/**
	 * 客户端渠道:ios / android / pc / wx_applet(微信小程序)
	 */
	@ApiField("user_client")
	private String userClient;

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public Boolean getCheckQuote() {
		return this.checkQuote;
	}
	public void setCheckQuote(Boolean checkQuote) {
		this.checkQuote = checkQuote;
	}

	public InsurePlanDTO getInsurePlanDto() {
		return this.insurePlanDto;
	}
	public void setInsurePlanDto(InsurePlanDTO insurePlanDto) {
		this.insurePlanDto = insurePlanDto;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public EcomOrderDTO getOrderDto() {
		return this.orderDto;
	}
	public void setOrderDto(EcomOrderDTO orderDto) {
		this.orderDto = orderDto;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

	public List<InsUserTraceDTO> getTraceList() {
		return this.traceList;
	}
	public void setTraceList(List<InsUserTraceDTO> traceList) {
		this.traceList = traceList;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
