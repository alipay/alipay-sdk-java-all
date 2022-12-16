package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自助监控服务接口
 *
 * @author auto create
 * @since 1.0, 2018-01-04 10:34:06
 */
public class AlipayCommerceDataMonitordataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7319271397385355879L;

	/**
	 * 传入的批量打包数据，dataEntry和dataDim的组合数据，详见dataEntry和dataDim的说明
	 */
	@ApiListField("datas")
	@ApiField("datas")
	private List<Datas> datas;

	/**
	 * 接口的版本，当前版本是v1.0.0
	 */
	@ApiField("interface_version")
	private String interfaceVersion;

	/**
	 * 监控产品码,用来区分当前接口调用传递数据属于哪种类型的产品.
商户可自定义.
	 */
	@ApiField("product_code")
	private String productCode;

	public List<Datas> getDatas() {
		return this.datas;
	}
	public void setDatas(List<Datas> datas) {
		this.datas = datas;
	}

	public String getInterfaceVersion() {
		return this.interfaceVersion;
	}
	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
