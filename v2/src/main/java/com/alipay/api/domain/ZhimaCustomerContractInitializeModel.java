package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻可信电子合约初始化
 *
 * @author auto create
 * @since 1.0, 2019-06-21 14:07:37
 */
public class ZhimaCustomerContractInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5182452345133137886L;

	/**
	 * 合约内容，必须是PDF文件流，BASE64编码
	 */
	@ApiField("contract_file")
	private String contractFile;

	/**
	 * 合约名称，会展示给签约方
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 芝麻认证产品码，示例值为真实的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getContractFile() {
		return this.contractFile;
	}
	public void setContractFile(String contractFile) {
		this.contractFile = contractFile;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
