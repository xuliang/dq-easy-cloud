package com.dq.easy.cloud.pay.model.base.pojo.builder;

import com.dq.easy.cloud.pay.model.payment.dto.DqPayOutMessageDTO;

/**
 * 
 * <p>
 * source chanjarster/weixin-java-tools
 * </p>
 *
 * @author daiqi 创建时间 2018年2月23日 下午3:16:43
 */
public class DqXmlBuilder extends DqBaseBuilder<DqXmlBuilder, DqPayOutMessageDTO> {
	private String content;
	private String code;

	public DqXmlBuilder content(String content) {
		this.content = content;
		return this;
	}

	public DqXmlBuilder code(String code) {
		this.code = code;
		return this;
	}

	@Override
	public DqPayOutMessageDTO build() {
		DqPayXmlOutMessage message = new DqPayXmlOutMessage();
		setCommon(message);
		message.setContent(content);
		message.setCode(code);
		return message;
	}
}
