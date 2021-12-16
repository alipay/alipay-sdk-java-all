package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OuterAttachment;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-08 11:49:23
 */
public class AlipayDataDataserviceAdPrincipalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4865499693878324927L;

	/** 
	 * 商家支付宝PID
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/** 
	 * 商家的全量资质列表
	 */
	@ApiListField("attachment_list")
	@ApiField("outer_attachment")
	private List<OuterAttachment> attachmentList;

	/** 
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/** 
	 * 商户审核拒绝理由
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/** 
	 * 状态：
ENABLE-生效
DISABLE-失效
CHECKING-待审核
FAILEDCHECK-审核未通过
INIT-初始化
RE_SIGN-待重签
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 二级行业ID
	 */
	@ApiField("trade_id")
	private String tradeId;

	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}
	public String getAlipayPid( ) {
		return this.alipayPid;
	}

	public void setAttachmentList(List<OuterAttachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public List<OuterAttachment> getAttachmentList( ) {
		return this.attachmentList;
	}

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getTradeId( ) {
		return this.tradeId;
	}

}
