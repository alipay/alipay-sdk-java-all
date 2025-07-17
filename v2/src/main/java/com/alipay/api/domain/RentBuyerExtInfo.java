package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁买家扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-03-18 16:05:55
 */
public class RentBuyerExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3772447366198412882L;

	/**
	 * 买家身份证地址
	 */
	@ApiField("cert_address")
	private RentAddress certAddress;

	/**
	 * 买家身份证反面照片
	 */
	@ApiField("cert_back_pic")
	private RentFile certBackPic;

	/**
	 * 买家身份证正面照片
	 */
	@ApiField("cert_font_pic")
	private RentFile certFontPic;

	/**
	 * 买家的身份号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 买家活体检测照片
	 */
	@ApiField("live_pic")
	private RentFile livePic;

	/**
	 * 买家的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 买家的名字
	 */
	@ApiField("name")
	private String name;

	public RentAddress getCertAddress() {
		return this.certAddress;
	}
	public void setCertAddress(RentAddress certAddress) {
		this.certAddress = certAddress;
	}

	public RentFile getCertBackPic() {
		return this.certBackPic;
	}
	public void setCertBackPic(RentFile certBackPic) {
		this.certBackPic = certBackPic;
	}

	public RentFile getCertFontPic() {
		return this.certFontPic;
	}
	public void setCertFontPic(RentFile certFontPic) {
		this.certFontPic = certFontPic;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public RentFile getLivePic() {
		return this.livePic;
	}
	public void setLivePic(RentFile livePic) {
		this.livePic = livePic;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
