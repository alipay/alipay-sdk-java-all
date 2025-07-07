package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 床型详情
 *
 * @author auto create
 * @since 1.0, 2024-01-24 18:55:17
 */
public class BedDetail extends AlipayObject {

	private static final long serialVersionUID = 8279654684667798872L;

	/**
	 * 床型长度（m）
	 */
	@ApiField("bed_length")
	private String bedLength;

	/**
	 * 该床型数量
	 */
	@ApiField("bed_number")
	private Long bedNumber;

	/**
	 * 床型类型
	 */
	@ApiField("bed_type")
	private String bedType;

	/**
	 * 床型宽度（m）
	 */
	@ApiField("bed_width")
	private String bedWidth;

	public String getBedLength() {
		return this.bedLength;
	}
	public void setBedLength(String bedLength) {
		this.bedLength = bedLength;
	}

	public Long getBedNumber() {
		return this.bedNumber;
	}
	public void setBedNumber(Long bedNumber) {
		this.bedNumber = bedNumber;
	}

	public String getBedType() {
		return this.bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getBedWidth() {
		return this.bedWidth;
	}
	public void setBedWidth(String bedWidth) {
		this.bedWidth = bedWidth;
	}

}
