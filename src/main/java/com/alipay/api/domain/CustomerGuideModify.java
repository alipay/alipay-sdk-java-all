package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改用户引导配置
 *
 * @author auto create
 * @since 1.0, 2021-05-07 21:20:58
 */
public class CustomerGuideModify extends AlipayObject {

	private static final long serialVersionUID = 5421811343868169697L;

	/**
	 * 券可使用的门店列表。
接口参数是列表类型。

限制：
store_ids中的门店id必须是支付宝门店id。

store_ids如果包含重复的门店id会自动进行去重操作。

传入的store_ids中包含的门店id数量 <= 3000。

修改门店列表，只允许增加不允许减少。
	 */
	@ApiListField("store_ids")
	@ApiField("string")
	private List<String> storeIds;

	public List<String> getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}

}
