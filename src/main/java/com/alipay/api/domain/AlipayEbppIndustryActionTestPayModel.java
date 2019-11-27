package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 视觉支付测试接口
 *
 * @author auto create
 * @since 1.0, 2018-09-04 10:54:06
 */
public class AlipayEbppIndustryActionTestPayModel extends AlipayObject {

	private static final long serialVersionUID = 6562621742768791388L;

	/**
	 * 买家在系统商签约的代扣协议编号
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 设备维度商品信息,列表
	 */
	@ApiListField("goods_infos")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsInfos;

	/**
	 * 售卖设备编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 系统商请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 买家支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public List<GoodsDetail> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<GoodsDetail> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
