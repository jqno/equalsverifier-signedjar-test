/*
 * Copyright 2017 Jan Ouwens
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
package nl.jqno.equalsverifier.signedjar;

/*
 * Abstract, to force EqualsVerifier to create a dynamic subclass.
 */
public abstract class SignedJarPoint {
    private final int x;
    private final int y;

    public SignedJarPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof SignedJarPoint)) {
            return false;
        }
        SignedJarPoint other = (SignedJarPoint)obj;
        return x == other.x && y == other.y;
    }

    @Override
    public final int hashCode() {
        return x + (31 * y);
    }
}
