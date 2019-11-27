package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 板块列表
 *
 * @author auto create
 * @since 1.0, 2019-09-26 09:34:15
 */
public class AntfortuneQuotationPlateIndexQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8868223566571199898L;

	/**
	 * 如果类型为getIds，则为空即可。
如果类型为getInfo,则填入板块id，多个板块id使用英文逗号分隔。
	 */
	@ApiField("plate_id")
	private String plateId;

	/**
	 * getIds 用于获取板块数据
getInfo 用于获取具体板块的数据
	 */
	@ApiField("type")
	private String type;

	public String getPlateId() {
		return this.plateId;
	}
	public void setPlateId(String plateId) {
		this.plateId = plateId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
