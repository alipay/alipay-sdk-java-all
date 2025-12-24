package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UniOpenResItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.solutionprod.unifiedopen.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 11:22:42
 */
public class AlipayTradeSolutionprodUnifiedopenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8371518566126287493L;

	/** 
	 * 开通绑定的支付宝登录号（脱敏）
	 */
	@ApiField("binding_logon_id")
	private String bindingLogonId;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 开通项结果列表
	 */
	@ApiListField("open_item_result_list")
	@ApiField("uni_open_res_item")
	private List<UniOpenResItem> openItemResultList;

	/** 
	 * 外部请求流水号，调用alipay.trade.solutionprod.unifiedopen.apply接口时由商户传入
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 聚合开通申请单号，聚合开通申请后由支付宝生成
	 */
	@ApiField("uniopen_order_id")
	private String uniopenOrderId;

	/** 
	 * INIT:已申请用户还未确认开通 、ROCESSING：开通中 、SUCCESS:所有开通项都成功 、FAIL:整体失败且需重新换单进行个人卖家进件&聚合开通，需要查看开通项结果明细，存在部分成功部分失败。若钱包成功，下一次请求中无需再开通，若需要设置默认结算账号为钱包，则将钱包id带入到下一次聚合开通请求中、RETYR:整体失败可原单重试（包括部分失败），根据错误原因进行排查，解决后可用原单进行重试
	 */
	@ApiField("uniopen_status")
	private String uniopenStatus;

	public void setBindingLogonId(String bindingLogonId) {
		this.bindingLogonId = bindingLogonId;
	}
	public String getBindingLogonId( ) {
		return this.bindingLogonId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOpenItemResultList(List<UniOpenResItem> openItemResultList) {
		this.openItemResultList = openItemResultList;
	}
	public List<UniOpenResItem> getOpenItemResultList( ) {
		return this.openItemResultList;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setUniopenOrderId(String uniopenOrderId) {
		this.uniopenOrderId = uniopenOrderId;
	}
	public String getUniopenOrderId( ) {
		return this.uniopenOrderId;
	}

	public void setUniopenStatus(String uniopenStatus) {
		this.uniopenStatus = uniopenStatus;
	}
	public String getUniopenStatus( ) {
		return this.uniopenStatus;
	}

}
