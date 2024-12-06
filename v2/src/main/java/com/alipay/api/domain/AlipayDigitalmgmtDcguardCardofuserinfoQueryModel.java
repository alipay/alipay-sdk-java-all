package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据用户工卡卡号查询用户信息
 *
 * @author auto create
 * @since 1.0, 2024-03-01 16:07:14
 */
public class AlipayDigitalmgmtDcguardCardofuserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6752548456537985276L;

	/**
	 * 主卡号
	 */
	@ApiField("main_no")
	private String mainNo;

	/**
	 * 物理卡号
	 */
	@ApiField("physical_no")
	private String physicalNo;

	/**
	 * 扇区号
	 */
	@ApiField("section_no")
	private String sectionNo;

	public String getMainNo() {
		return this.mainNo;
	}
	public void setMainNo(String mainNo) {
		this.mainNo = mainNo;
	}

	public String getPhysicalNo() {
		return this.physicalNo;
	}
	public void setPhysicalNo(String physicalNo) {
		this.physicalNo = physicalNo;
	}

	public String getSectionNo() {
		return this.sectionNo;
	}
	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

}
