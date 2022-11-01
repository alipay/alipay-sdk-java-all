package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 唤起云凤蝶站点编辑器返回模型，包含 编辑器具体免登的url
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:03
 */
public class FengdieEditorGetRespModel extends AlipayObject {

	private static final long serialVersionUID = 5226598473868481561L;

	/**
	 * 云凤蝶编辑器访问地址，可通过iframe集成在后台系统，由系统用户编辑H5应用内容。url的有效期为15秒，因此每次需要编辑h5页面的时候应该重新调用Api生成。
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
