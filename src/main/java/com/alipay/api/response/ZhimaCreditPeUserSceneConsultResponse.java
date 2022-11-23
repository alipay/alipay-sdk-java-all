package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.scene.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 20:11:38
 */
public class ZhimaCreditPeUserSceneConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5448119169173233779L;

	/** 
	 * 展示给C看的文案，json格式字符串
	 */
	@ApiField("display_msg")
	private String displayMsg;

	/** 
	 * 在该信用场景下是否已签约
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 用户在该场景下能否享用免押，返回true：可享受免押，返回false：不可享受免押
	 */
	@ApiField("permit")
	private Boolean permit;

	/** 
	 * 拒绝码，只有当permit为false时，才有值
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因描述，只有在permit=false时，才会返回该信息
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 芝麻咨询单号，业务处理成功后，芝麻返回该字段，实际使用时请注意保存该字段
	 */
	@ApiField("risk_order_no")
	private String riskOrderNo;

	/** 
	 * 盖帽额度，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("top_amount")
	private String topAmount;

	/** 
	 * 可免押盖帽物品件数
	 */
	@ApiField("top_goods_count")
	private Long topGoodsCount;

	/** 
	 * 芝麻分等级,比如L1表示芝麻分大于750小于850, 可按场景自定义配置
	 */
	@ApiField("zm_score_level")
	private String zmScoreLevel;

	public void setDisplayMsg(String displayMsg) {
		this.displayMsg = displayMsg;
	}
	public String getDisplayMsg( ) {
		return this.displayMsg;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setPermit(Boolean permit) {
		this.permit = permit;
	}
	public Boolean getPermit( ) {
		return this.permit;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRiskOrderNo(String riskOrderNo) {
		this.riskOrderNo = riskOrderNo;
	}
	public String getRiskOrderNo( ) {
		return this.riskOrderNo;
	}

	public void setTopAmount(String topAmount) {
		this.topAmount = topAmount;
	}
	public String getTopAmount( ) {
		return this.topAmount;
	}

	public void setTopGoodsCount(Long topGoodsCount) {
		this.topGoodsCount = topGoodsCount;
	}
	public Long getTopGoodsCount( ) {
		return this.topGoodsCount;
	}

	public void setZmScoreLevel(String zmScoreLevel) {
		this.zmScoreLevel = zmScoreLevel;
	}
	public String getZmScoreLevel( ) {
		return this.zmScoreLevel;
	}

}
