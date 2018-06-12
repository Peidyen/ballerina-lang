/*
 * Copyright 2015, gRPC Authors All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ballerinalang.net.grpc;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Represents a message compressor.
 */
public interface Compressor {
  /**
   * Returns the message encoding that this compressor uses.
   *
   * <p>This can be values such as "gzip", "deflate", "snappy", etc.
   */
  String getMessageEncoding();

  /**
   * Wraps an existing output stream with a compressing output stream.
   * @param os The output stream of uncompressed data
   * @return An output stream that compresses
   */
  OutputStream compress(OutputStream os) throws IOException;
}

