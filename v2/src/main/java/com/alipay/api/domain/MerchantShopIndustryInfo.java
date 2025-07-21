package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店行业信息
 *
 * @author auto create
 * @since 1.0, 2024-07-11 23:23:14
 */
public class MerchantShopIndustryInfo extends AlipayObject {

	private static final long serialVersionUID = 6553468197623491423L;

	/**
	 * 行业信息CODE
	 */
	@ApiField("info_code")
	private String infoCode;

	/**
	 * 行业信息值，具体值根据info_code决定。
当info_code=SHOP_MEDICAL_LOGO/SHOP_MEDICAL_IN_PIC这类文件信息时，
需要传入ant.merchant.expand.indirect.image.upload接口上传的文件key；当info_code= SHOP_MEDICAL_LEVEL_TAG时，需要<a href="https://mdn.alipayobjects.com/mrcheshop/afts/file/ZuDmQKgBifgAAAAAAAAAAAAADiWmAQBr?af_filename=医院类型.xlsx">医院类型</a>中CODE；其他场景传入自定义文本即可。
	 */
	@ApiListField("info_value")
	@ApiField("string")
	private List<String> infoValue;

	public String getInfoCode() {
		return this.infoCode;
	}
	public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}

	public List<String> getInfoValue() {
		return this.infoValue;
	}
	public void setInfoValue(List<String> infoValue) {
		this.infoValue = infoValue;
	}

}
