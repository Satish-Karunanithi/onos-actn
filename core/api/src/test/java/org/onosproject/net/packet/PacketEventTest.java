/*
 * Copyright 2015 Open Networking Laboratory
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
package org.onosproject.net.packet;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for PacketEvent class.
 */
public class PacketEventTest {

    OutboundPacket packet;

    @Test
    public void testConstruction1() {
        long time = System.currentTimeMillis();
        PacketEvent event = new PacketEvent(PacketEvent.Type.EMIT, packet);

        assertThat(event.type(), is(PacketEvent.Type.EMIT));
        assertThat(event.subject(), is(packet));
        assertThat(event.time(), greaterThanOrEqualTo(time));
    }

    @Test
    public void testConstruction2() {
        long time = 12345678;
        PacketEvent event = new PacketEvent(PacketEvent.Type.EMIT, packet, time);

        assertThat(event.type(), is(PacketEvent.Type.EMIT));
        assertThat(event.subject(), is(packet));
        assertThat(event.time(), is(time));
    }

}