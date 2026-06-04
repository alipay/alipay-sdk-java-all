package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凭证撤销核销详情
 *
 * @author auto create
 * @since 1.0, 2026-05-18 19:12:00
 */
public class CertificateReverseInfo extends AlipayObject {

	private static final long serialVersionUID = 8564499838714227247L;

	/**
	 * 用户凭证ID。
凭证ID为空时默认撤销use_order_no下所有数据，
凭证ID传入会校验use_order_no是否包含certificate_id核销数据
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 撤销核销次序号
	 */
	@ApiListField("serial_no_list")
	@ApiField("string")
	private List<String> serialNoList;

	/**
	 * 该值不为空时，certificate_id不能为空
 次卡撤销核销的次数，只有次卡该值生效。指定次序号核销核销时，该值必须与次序号数量一致。
	 */
	@ApiField("times_card_cancel_count")
	private Long timesCardCancelCount;

	/**
	 * 核销操作单号
	 */
	@ApiField("use_order_no")
	private String useOrderNo;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public List<String> getSerialNoList() {
		return this.serialNoList;
	}
	public void setSerialNoList(List<String> serialNoList) {
		this.serialNoList = serialNoList;
	}

	public Long getTimesCardCancelCount() {
		return this.timesCardCancelCount;
	}
	public void setTimesCardCancelCount(Long timesCardCancelCount) {
		this.timesCardCancelCount = timesCardCancelCount;
	}

	public String getUseOrderNo() {
		return this.useOrderNo;
	}
	public void setUseOrderNo(String useOrderNo) {
		this.useOrderNo = useOrderNo;
	}

}
