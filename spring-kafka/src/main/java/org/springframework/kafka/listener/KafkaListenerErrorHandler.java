/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.kafka.listener;

import org.springframework.messaging.Message;

/**
 * An error handler which is called when a {code @KafkaListener} method
 * throws an exception. This is invoked higher up the stack than the
 * listener container's error handler.
 *
 * @author Venil Noronha
 * @since 1.3
 */
@FunctionalInterface
public interface KafkaListenerErrorHandler {

	/**
	 * Handle the error.
	 * @param message the spring-messaging message.
	 * @param exception the exception the listener threw, wrapped in a
	 * {@link ListenerExecutionFailedException}.
	 * @return the return value is ignored.
	 * @throws Exception an exception which may be the original or different.
	 */
	Object handleError(Message<?> message, ListenerExecutionFailedException exception) throws Exception;

}