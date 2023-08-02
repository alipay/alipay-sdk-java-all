package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租约状态同步
 *
 * @author auto create
 * @since 1.0, 2020-05-07 15:28:19
 */
public class AlipayEcoRenthouseLeaseStateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2747379261177913617L;

	/**
	 * 租约电子合同图片，内容字节组Base64处理，支持jpg、png、jpeg、bmp格式
	 */
	@ApiField("lease_ca_file")
	private String leaseCaFile;

	/**
	 * 租约编号(KA内部租约业务编号)
	 */
	@ApiField("lease_code")
	private String leaseCode;

	/**
	 * 租约状态
0-未确认
1-已确认
2-已退房
3-已撤销
	 */
	@ApiField("lease_status")
	private Long leaseStatus;

	public String getLeaseCaFile() {
		return this.leaseCaFile;
	}
	public void setLeaseCaFile(String leaseCaFile) {
		this.leaseCaFile = leaseCaFile;
	}

	public String getLeaseCode() {
		return this.leaseCode;
	}
	public void setLeaseCode(String leaseCode) {
		this.leaseCode = leaseCode;
	}

	public Long getLeaseStatus() {
		return this.leaseStatus;
	}
	public void setLeaseStatus(Long leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

}
