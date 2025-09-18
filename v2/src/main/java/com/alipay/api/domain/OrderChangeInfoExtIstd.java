package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单变更通知扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-06-13 21:27:56
 */
public class OrderChangeInfoExtIstd extends AlipayObject {

	private static final long serialVersionUID = 6433741374154826523L;

	/**
	 * 新增可选参数支持通过通知接口向商户同步“揽收/投递照片”链接
	 */
	@ApiListField("work_pic_link")
	@ApiField("string")
	private List<String> workPicLink;

	public List<String> getWorkPicLink() {
		return this.workPicLink;
	}
	public void setWorkPicLink(List<String> workPicLink) {
		this.workPicLink = workPicLink;
	}

}
