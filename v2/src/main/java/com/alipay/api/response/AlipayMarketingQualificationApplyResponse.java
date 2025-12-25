package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QualificationVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 21:32:41
 */
public class AlipayMarketingQualificationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3533596256786154384L;

	/** 
	 * 锚定物id
	 */
	@ApiField("anchor_id")
	private String anchorId;

	/** 
	 * 锚定物实例id
	 */
	@ApiField("anchor_instance_id")
	private String anchorInstanceId;

	/** 
	 * 资格ID
	 */
	@ApiField("qual_id")
	private String qualId;

	/** 
	 * 资格实例ID
	 */
	@ApiField("qual_instance_id")
	private String qualInstanceId;

	/** 
	 * 锚定物资格券信息
	 */
	@ApiField("voucher")
	private QualificationVoucherDTO voucher;

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
	}
	public String getAnchorId( ) {
		return this.anchorId;
	}

	public void setAnchorInstanceId(String anchorInstanceId) {
		this.anchorInstanceId = anchorInstanceId;
	}
	public String getAnchorInstanceId( ) {
		return this.anchorInstanceId;
	}

	public void setQualId(String qualId) {
		this.qualId = qualId;
	}
	public String getQualId( ) {
		return this.qualId;
	}

	public void setQualInstanceId(String qualInstanceId) {
		this.qualInstanceId = qualInstanceId;
	}
	public String getQualInstanceId( ) {
		return this.qualInstanceId;
	}

	public void setVoucher(QualificationVoucherDTO voucher) {
		this.voucher = voucher;
	}
	public QualificationVoucherDTO getVoucher( ) {
		return this.voucher;
	}

}
