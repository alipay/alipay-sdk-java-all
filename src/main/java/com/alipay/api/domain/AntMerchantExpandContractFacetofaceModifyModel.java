package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当面付申请修改接口
 *
 * @author auto create
 * @since 1.0, 2017-05-12 10:19:51
 */
public class AntMerchantExpandContractFacetofaceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3493133141441975659L;

	/**
	 * 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片
	 */
	@ApiField("business_license_auth_pic")
	private String businessLicenseAuthPic;

	/**
	 * 营业执照号码（个人账户必填，企业账户选填）
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a>
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 支付宝端商户入驻申请单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部入驻申请单据号，需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 店铺内景图片
	 */
	@ApiField("shop_scene_pic")
	private String shopScenePic;

	/**
	 * 店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	/**
	 * 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a>
	 */
	@ApiField("special_license_pic")
	private String specialLicensePic;

	public String getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}
	public void setBusinessLicenseAuthPic(String businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getShopScenePic() {
		return this.shopScenePic;
	}
	public void setShopScenePic(String shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

	public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}
	public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

	public String getSpecialLicensePic() {
		return this.specialLicensePic;
	}
	public void setSpecialLicensePic(String specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

}
