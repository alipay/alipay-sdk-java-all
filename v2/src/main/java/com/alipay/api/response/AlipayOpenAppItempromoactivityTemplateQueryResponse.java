package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoActivityAccessActionVO;
import com.alipay.api.domain.PromoActivityAttrVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.itempromoactivity.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-03 10:27:54
 */
public class AlipayOpenAppItempromoactivityTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5226463427819253862L;

	/** 
	 * 可准入的方法
	 */
	@ApiField("access_action")
	private PromoActivityAccessActionVO accessAction;

	/** 
	 * 属性列表
	 */
	@ApiListField("activity_attrs")
	@ApiField("promo_activity_attr_v_o")
	private List<PromoActivityAttrVO> activityAttrs;

	/** 
	 * 描述商品营销活动
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 营销活动类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/** 
	 * 小程序是否准入
	 */
	@ApiField("proved")
	private Boolean proved;

	/** 
	 * 描述不准入原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 营销活动标题
	 */
	@ApiField("title")
	private String title;

	public void setAccessAction(PromoActivityAccessActionVO accessAction) {
		this.accessAction = accessAction;
	}
	public PromoActivityAccessActionVO getAccessAction( ) {
		return this.accessAction;
	}

	public void setActivityAttrs(List<PromoActivityAttrVO> activityAttrs) {
		this.activityAttrs = activityAttrs;
	}
	public List<PromoActivityAttrVO> getActivityAttrs( ) {
		return this.activityAttrs;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	public String getPromotionType( ) {
		return this.promotionType;
	}

	public void setProved(Boolean proved) {
		this.proved = proved;
	}
	public Boolean getProved( ) {
		return this.proved;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
