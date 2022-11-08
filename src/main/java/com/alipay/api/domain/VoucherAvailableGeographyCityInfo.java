package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用城市
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherAvailableGeographyCityInfo extends AlipayObject {

	private static final long serialVersionUID = 3247594843896952522L;

	/**
	 * 是否全国。 选择全国后，无须填写city_codes字段。系统默认填充全国全部城市信息。
	 */
	@ApiField("all_city")
	private Boolean allCity;

	/**
	 * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiListField("available_city_codes")
	@ApiField("string")
	private List<String> availableCityCodes;

	public Boolean getAllCity() {
		return this.allCity;
	}
	public void setAllCity(Boolean allCity) {
		this.allCity = allCity;
	}

	public List<String> getAvailableCityCodes() {
		return this.availableCityCodes;
	}
	public void setAvailableCityCodes(List<String> availableCityCodes) {
		this.availableCityCodes = availableCityCodes;
	}

}
