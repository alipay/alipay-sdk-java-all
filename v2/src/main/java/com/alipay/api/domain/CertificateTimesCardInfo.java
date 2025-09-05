package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 次卡信息
 *
 * @author auto create
 * @since 1.0, 2024-11-08 14:49:18
 */
public class CertificateTimesCardInfo extends AlipayObject {

	private static final long serialVersionUID = 2184448672369216361L;

	/**
	 * 次卡次序号信息
	 */
	@ApiListField("serial_info_list")
	@ApiField("certificate_serial_info")
	private List<CertificateSerialInfo> serialInfoList;

	/**
	 * 次卡总次数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 已使用次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	public List<CertificateSerialInfo> getSerialInfoList() {
		return this.serialInfoList;
	}
	public void setSerialInfoList(List<CertificateSerialInfo> serialInfoList) {
		this.serialInfoList = serialInfoList;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
