package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:01
 */
public class AlipayInsSceneProductAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8228954446611193993L;

	/** 
	 * 商户签约类型
	 */
	@ApiField("agreeement_sign_type")
	private String agreeementSignType;

	/** 
	 * 商户支付宝2088用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 商户协议有效期结束时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/** 
	 * 商户协议生效开始渐渐
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/** 
	 * 产品机构产品码
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品协议签约号，协议唯一业务号
	 */
	@ApiField("product_sign_no")
	private String productSignNo;

	/** 
	 * 签约用户id，根据sign_user_type一致
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/** 
	 * 签约用户类型 ，见字段枚举
	 */
	@ApiField("sign_user_type")
	private String signUserType;

	/** 
	 * 产品状态，见状态枚举
	 */
	@ApiField("status")
	private Long status;

	public void setAgreeementSignType(String agreeementSignType) {
		this.agreeementSignType = agreeementSignType;
	}
	public String getAgreeementSignType( ) {
		return this.agreeementSignType;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}
	public Date getEffectEndTime( ) {
		return this.effectEndTime;
	}

	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}
	public Date getEffectStartTime( ) {
		return this.effectStartTime;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setProductSignNo(String productSignNo) {
		this.productSignNo = productSignNo;
	}
	public String getProductSignNo( ) {
		return this.productSignNo;
	}

	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}
	public String getSignUserId( ) {
		return this.signUserId;
	}

	public void setSignUserType(String signUserType) {
		this.signUserType = signUserType;
	}
	public String getSignUserType( ) {
		return this.signUserType;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
